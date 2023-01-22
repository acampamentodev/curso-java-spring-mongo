package br.com.acampamentodev.exemplo1.servico;

import br.com.acampamentodev.exemplo1.entidade.Aluno;
import br.com.acampamentodev.exemplo1.repositorio.AlunoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServico {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> obterTodos() {
        return alunoRepository.findAll();
    }

    public Aluno inserir(Aluno aluno) {
        alunoRepository.insert(aluno);
        return aluno;
    }

    public Aluno atualizar(int matricula, Aluno novosDadosDoAluno) {
        Aluno aluno = selecionarAlunoPelaMatricula(matricula);

        if (aluno != null) {
            BeanUtils.copyProperties(novosDadosDoAluno, aluno);
            alunoRepository.save(aluno);
        }

        return aluno;
    }

    public void remove(int matricula) {
        Aluno aluno = selecionarAlunoPelaMatricula(matricula);

        if (aluno != null) {
            alunoRepository.delete(aluno);
        }
    }

    public Aluno selecionarAlunoPelaMatricula(int matricula) {
        Aluno aluno = alunoRepository.findByMatricula(matricula);

        return aluno;
    }

}
