var URL = 'https://script.google.com/macros/s/AKfycbx7odkQIcMiteJJxiOI3bACX2cAWzgxsJUeTp5GAcCNegku020590hK7XJaczP2YCpF/exec'

fetch(URL)
.then( resposta => resposta.json() )
.then( dados => preencherDados(dados))
.catch( err => console.error("Deu ruim: ", err))

function preencherDados(alunos){
    console.log(alunos);
    const miolo = document.querySelector('#miolo');
    alunos.forEach( aluno => {
        miolo.innerHTML +=  `
        <div class="card">
        <span class="cor red"></span>
        <div class="foto">
            <img src="${aluno.foto}" alt="">
        </div>
        <div class="dados">
            <div id="nome">${aluno.nome}</div>
            <div id="email">${aluno.email}</div>
            <div id="cidade">${aluno.cidade}</div>
            <div id="cidade"> Idade: ${2024 - aluno.nascimento}</div>
        </div>
    </div>
        `
    });
}