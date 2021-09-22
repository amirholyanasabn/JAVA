
function isEmpty() {
    var nameInput = document.getElementById("name");
    var name = nameInput.value;

    if (name === null || name === "" || name === undefined) {
        var messageAlert = document.getElementById("error");
       messageAlert.style.display = "block";
       return false;
    }else
        messageAlert.style.display = "none";
        return true;
}