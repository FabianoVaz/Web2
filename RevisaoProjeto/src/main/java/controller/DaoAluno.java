package controller;

import java.util.List;

import org.hibernate.Session;

import model.Aluno;

public class DaoAluno {

	public void add(Aluno aluno) {
		// INSERT
		System.out.println("Cadastrando o Aluno: " + aluno.getNome());
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.persist(aluno);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void delete(Aluno aluno) {
		// DELETE
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.remove(aluno);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void update(Aluno aluno) {
		// DELETE
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.merge(aluno);
		sessao.getTransaction().commit();
		sessao.close();
	}

	public Aluno findById(int id) {
		// SELECT * FROM <table> WHERE id = <id>
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		Aluno aluno = (Aluno) sessao.createQuery("FROM Aluno WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return aluno;
	}
	
	public List<Aluno> listar() {
		// SELECT * FROM <table>
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Aluno> alunos = sessao.createQuery("FROM Aluno").list();
		sessao.getTransaction().commit();
		sessao.close();
		return alunos;
	}
	
	
}
