function isValid() {
    let firstIn = document.getElementById("first-number");
    let secondIn = document.getElementById("second-number");
    let first = firstIn.value;
    let second = secondIn.value;

    if (first === null || first === undefined || first === "" || second === null || second === undefined || second ===""){
        let divError = document.getElementById("div-error");
        divError.style.display = "block";
        return false;
    }else {
        divError.style.display = "none";
        return true;
    }
}