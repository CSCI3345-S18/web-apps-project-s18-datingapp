/**
 * This is the JavaScript file for doing draw via websockets. 
 */

console.log("Running canvas/drawing setup.");
var canvas = document.getElementById("drawSpace");
var ctx = canvas.getContext("2d");



//Movement/Circle
var spawnX = canvas.width * Math.random();
var spawnY = canvas.height * Math.random();

var rightPressed = false;
var leftPressed = false;
var upPressed = false;
var downPressed = false;
var color = '#'+Math.random().toString(16).substring(2);
color = color.substring(0, color.length-7);

var myPlayer;

// Create WebSocket connection.
const socket = new WebSocket('ws://'+window.location.hostname+':'+window.location.port+'/socket');

//keyDownHandlers
document.addEventListener("keydown", keyDownHandler, false);
document.addEventListener("keyup", keyUpHandler, false);

function keyDownHandler(e) {
	
    if(e.keyCode == 39) {
    	var rect = {
    			"posX": spawnX += 3,
    			"posY": spawnY,
    			"width": 25,
    			"height": 25,
    			"color": color
    	}
        rightPressed = true;
        console.log(rect.posX);
        clientRect = JSON.stringify(rect);
        socket.send(clientRect);
    }
    else if(e.keyCode == 37) {
    	var rect = {
    			"posX": spawnX -= 3,
    			"posY": spawnY,
    			"width": 25,
    			"height": 25,
    			"color": color
    	}
        leftPressed = true;
        console.log(rect.posX);
        clientRect = JSON.stringify(rect);
        socket.send(clientRect);
    }
    else if (e.keyCode == 40) {
    	var rect = {
    			"posX": spawnX,
    			"posY": spawnY += 3,
    			"width": 25,
    			"height": 25,
    			"color": color
    	}
        downPressed = true;
        console.log(rect.posX);
        clientRect = JSON.stringify(rect);
        socket.send(clientRect);
        //socket.send(speedX);
    }
    else if (e.keyCode == 38) {
    	var rect = {
    			"posX": spawnX,
    			"posY": spawnY -= 3,
    			"width": 25,
    			"height": 25,
    			"color": color
    	}
        upPressed = true;
        console.log(rect.posX);
        clientRect = JSON.stringify(rect);
        socket.send(clientRect);
        //socket.send(speedX);
    }
}

function keyUpHandler(e) {
    if(e.keyCode == 39) {
        rightPressed = false;
        socket.send(rightPressed);
    }
    else if(e.keyCode == 37) {
        leftPressed = false;
        socket.send(leftPressed);
    }
    else if (e.keyCode == 40) {
    	downPressed = false;
    	socket.send(downPressed);
    }
    else if (e.keyCode == 38) {
    	upPressed = false;
    	socket.send(upPressed);
    }
}

//RECTANGLE
function component(posX, posY, width, height) {
	this.posX = posX;
	this.posY = posY;
	this.width = width;
	this.height = height;
	this.create = function() {
	  ctx.beginPath();
	  ctx.rect(posX * Math.random(), posY * Math.random(), width, height);
	  ctx.fillStyle = color;
	  ctx.fill();
	  ctx.closePath();
	}
	this.move = function() {
		 if(rightPressed = true) {
		        //posX += 3;
		        socket.send(rightPressed);
		        //socket.send(posX);
		    }
		    else if(leftPressed = true) {
		        posX = -3;
		        socket.send(leftPressed);
		        socket.send(speedX);
		    }
		    else if (downPressed = true) {
		    	speedY = 3;
		    	socket.send(downPressed);
		    }
		    else if (upPressed = true) {
		    	speedY = -3;
		    	socket.send(upPressed);
		    }
	}

}


/* CIRCLE
function component(posX, posY, rad, startAng, endAng) {
	this.posX = posX;
	this.posY = posY;
	this.rad = rad;
	this.startAng = startAng;
	this.endAng = endAng;
	this.create = function() {
	  ctx.beginPath();
	  ctx.arc(this.x, this.y, this.rad, 0, Math.PI*2);
	  ctx.fillStyle = color;
	  ctx.fill();
	  ctx.closePath();
	}
	this.move = function() {
		 if(rightPressed = true) {
		        posX += 3;
		        //socket.send(rightPressed);
		        socket.send(posX);
		    }
		    else if(leftPressed = true) {
		        posX = -3;
		        //socket.send(leftPressed);
		        socket.send(speedX);
		    }
		    else if (downPressed = true) {
		    	speedY = 3;
		    	//socket.send(downPressed);
		    }
		    else if (upPressed = true) {
		    	speedY = -3;
		    	//socket.send(upPressed);
		    }
	}

}
*/




// Connection opened
socket.addEventListener('open', function (event) {
	var circle = {
			"posX": 0,
			"posY": 0,
			"rad": 10,
			"startAng": 0,
			"endAng": Math.PI*2
	};
	var rect = {
			"posX": spawnX,
			"posY": spawnY,
			"width": 25,
			"height": 25,
			"color": color
	};
	myPosX = circle.posX;
	myPosY = circle.posY;
	//var myCircle = new component(circle.posX, circle.posY, circle.rad, circle.startAng, circle.endAng);
	//var myRect = new component(rect.posX, rect.posY, rect.width, rect.height);
	
	/*
	ctx.beginPath();
	ctx.rect(rect.posX, rect.posY,rect.width, rect.height);
	ctx.fillStyle = color;
	ctx.fill();
    ctx.closePath();
    */
	
	
	
	
	//ctx.clearRect(0, 0, canvas.width, canvas.height);
	//myCircle.create();
	//myCircle.move();
	//myRect.move();
	
	var clientRect = JSON.stringify(rect);
    socket.send(clientRect);
    
});




socket.addEventListener('message', function (event) {
	
	
	var obj = JSON.parse(event.data);
	ctx.beginPath();
	ctx.rect(obj.posX, obj.posY,obj.width, obj.height);
	ctx.fillStyle = obj.color;
	ctx.fill();
	ctx.closePath();
	
	
	//console.log(rect);
	

	//ctx.clearRect(0, 0, canvas.width, canvas.height);
	

	
	
});



