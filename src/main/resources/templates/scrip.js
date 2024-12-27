const botones = document.querySelectorAll('.btn');
const display = document.querySelector('.display');

botones.forEach(boton => {
    boton.addEventListener('click', () => {
        let calculo = "";
        const valor = boton.textContent;
        if (valor === "="){
            calculo = display.value
            alert(calculo)
            display.value = ""
        }else{
            display.value += valor;
        }
    });
});