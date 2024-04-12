
var x = document.querySelector("#item");
x.addEventListener("click", (item) => {clicouBotao(item)});

function clicouBotao( elem ){
    console.log(elem)
    elem.style.borderRadius = "50%"
    elem.style.backgroundColor = "blue"
    elem.innerText = "clicou aqui"
}