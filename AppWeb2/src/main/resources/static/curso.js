var form = document.querySelector("#form-curso");

form.addEventListener("submit", enviarDados);

function enviarDados(event){
    event.preventDefault();

    const dados = new FormData(event.target);

    let jsonDados = {};  
    dados.forEach( (valor, chave) => {
        jsonDados[chave] = valor;
    });

    fetch(event.target.action, {
        method: 'POST',
        body: JSON.stringify(jsonDados),
        headers: {'Content-Type': 'application/json'}
    })
    .then(resposta => resposta.json())
    .then(retorno => {
        console.log(retorno)
        document.location.reload(true);
    })
    .catch(erro => console.log(erro))
}

function obterDados(){
    fetch("http://localhost:8080/curso")
    .then(resposta => resposta.json())
    .then(retorno => {
        const corpoTB = document.querySelector("#tb-curso tbody");
        retorno.forEach( item =>{
            corpoTB.innerHTML += 
            `<tr>
                <td>${item.id}</td>
                <td>${item.nome}</td>
                <td>${item.modalidade}</td>
            </tr>`
        })
    })
    .catch(erro => console.log(erro))
}

obterDados();