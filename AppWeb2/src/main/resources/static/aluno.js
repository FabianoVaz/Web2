var form = document.querySelector("#form-aluno");

form.addEventListener("submit", enviarDados);

function enviarDados(event){
    event.preventDefault();

    const dados = new FormData(event.target);

    let jsonDados = {};  
    dados.forEach( (valor, chave) => {
        jsonDados[chave] = valor;
    });
    
    /* jsonDados = {
    	"nome": "alguma coisa",
    	"email": "outra coisa"
		}
    */

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
    fetch("http://localhost:8080/aluno")
    .then(resposta => resposta.json())
    .then(retorno => {
        const corpoTB = document.querySelector("#tb-aluno tbody");
        retorno.forEach( item =>{
            corpoTB.innerHTML += 
            `<tr>
                <td>${item.id}</td>
                <td>${item.nome}</td>
                <td>${item.email}</td>
            </tr>`
        })
    })
    .catch(erro => console.log(erro))
}

obterDados();