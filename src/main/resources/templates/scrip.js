const botones = document.querySelectorAll('.btn');
const display = document.querySelector('.display');

botones.forEach(boton => {
    boton.addEventListener('click', () => {
        let calculo = "";
        const valor = boton.textContent;
        if (valor === "="){
            calculo = display.value
            const calculoObject = {
                operation:calculo
            };
            const jsonString = JSON.stringify(calculoObject);
            fetch("http://127.0.0.1:8080/calculadora" , {
                method: 'POST',
                headers: {
                    'Content-type':'application/json'
                },
                body: jsonString
            })
            .then(response => response.json())
            display.value = ""
        }else{
            display.value += valor;
        }
    });
});