(function () {
  // Avoid duplicate buttons
  if (document.querySelector("#start-btn")) return;

  // Gmail compose window bottom toolbar
  const toolbar = document.querySelector(".gU.Up");
  if (!toolbar) {
    alert("Please open the compose window to add the AI Reply button!");
    return;
  }

  // Create AI Reply button
  const btn = document.createElement("button");
  btn.id = "start-btn";
  btn.innerText = "AI Reply";
  btn.style.padding = "6px 12px";
  btn.style.marginLeft = "10px";
  btn.style.background = "#1a73e8";
  btn.style.color = "white";
  btn.style.border = "none";
  btn.style.borderRadius = "4px";
  btn.style.cursor = "pointer";

  // On button click → open React app
  btn.addEventListener("click", () => {
    window.open("http://localhost:3000", "_blank"); 
  });

  // Insert button next to Gmail's Send button
  const sendButton = toolbar.querySelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3");
  if (sendButton) {
    sendButton.parentNode.insertBefore(btn, sendButton.nextSibling);
  } else {
    toolbar.appendChild(btn);
  }
})();
