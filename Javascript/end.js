/* var cep = {
    cep: "01001-000",
    logradouro: "Praça da Ré",
    complemento: "lado ímpar",
    bairro: "Sé",
    localidade: "São Paulo",
    uf: "SP",
    ibge: "3550308",
    gia: "1004",
    ddd: "11",
    siafi: "7107"
} */

function teste(cep){
    var elem = document.querySelector("#endereco")
    elem.innerHTML = `
    <table>
        <tr>
            <th>Campo</th>
            <th>Valor</th>
        </tr>
        <tr>
            <td>CEP</td>
            <td>${cep.cep}</td>
        </tr>
        <tr>
            <td>Logradouro</td>
            <td>${cep.logradouro}</td>
        </tr>
        <tr>
            <td>Complemento</td>
            <td>${cep.complemento}</td>
        </tr>
        <tr>
            <td>Bairro</td>
            <td>${cep.bairro}</td>
        </tr>
        <tr>
            <td>Localidade</td>
            <td>${cep.localidade}</td>
        </tr>
        <tr>
            <td>UF</td>
            <td>${cep.uf}</td>
        </tr>
        <tr>
            <td>IBGE</td>
            <td>${cep.ibge}</td>
        </tr>
        <tr>
            <td>GIA</td>
            <td>${cep.gia}</td>
        </tr>
        <tr>
            <td>DDD</td>
            <td>${cep.ddd}</td>
        </tr>
        <tr>
            <td>SIAFI</td>
            <td>${cep.siafi}</td>
        </tr>
    </table>
    `;    
}

var cep = prompt("Digite um CEP: ");

fetch(`https://viacep.com.br/ws/${cep}/json`)
  .then((response) => response.json())
  .then((item) => teste(item) )
  .catch((error) => console.error('Deu ruim:', error));