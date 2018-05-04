// Create WebSocket connection.
const socket = new WebSocket('ws://'+window.location.hostname+':'+window.location.port+'/socket');

// Connection opened
socket.addEventListener('open', function (event) {
    
});

// Listen for messages
socket.addEventListener('message', function (event) {
    const elem = document.getElementById("messages");
    const newP = document.createElement("p");
    newP.innerHTML = event.data;
    elem.prepend(newP);
});

const textInput = document.getElementById("input");
textInput.addEventListener("keyup", (event) => {
	if(event.keyCode === 13) {
		socket.send(textInput.value);
		textInput.value = "";
	}
});