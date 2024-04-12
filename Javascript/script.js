const ifba = {
    turma: {
      codigo: 401,
      nome: "4º Módulo",
      periodo: "2024.1"
    },
    disciplina: {
      codigo: "INS402",
      nome: "Desenvolvimento Web II",
      carga_horaria: "60 horas"
    },
    professor: {
      nome: "Fabiano Vaz",
      especialidade: "Programação",
      email: "fabiano.vaz@ifba.edu.br"
    }
  }
  
var miolo = document.getElementById("miolo");

miolo.innerHTML = `
<table>
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Período</th>
    </tr>
    <tr>
        <td>${ifba.turma.codigo}</td>
        <td>${ifba.turma.nome}</td>
        <td>${ifba.turma.periodo}</td>
    </tr>
</table>

<h2>Disciplina</h2>
<table>
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Carga Horária</th>
    </tr>
    <tr>
        <td>${ifba.disciplina.codigo}</td>
        <td>${ifba.disciplina.nome}</td>
        <td>${ifba.disciplina.carga_horaria}</td>
    </tr>
</table>

<h2>Professor</h2>
<table>
    <tr>
        <th>Nome</th>
        <th>Especialidade</th>
        <th>Email</th>
    </tr>
    <tr>
        <td>${ifba.professor.nome}</td>
        <td>${ifba.professor.especialidade}</td>
        <td>${ifba.professor.email}</td>
    </tr>
</table>
`