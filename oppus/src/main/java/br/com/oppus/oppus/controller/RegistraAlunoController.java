package br.com.oppus.oppus.controller;

import br.com.oppus.oppus.dao.MatriculaRepository;
import br.com.oppus.oppus.model.Matricula;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegistraAlunoController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @GetMapping("/registra-aluno.html")
    public String registraAluno() {
        return "registra-aluno"; // retorna o nome do arquivo HTML sem a extensão
    }

    @PostMapping("/salvar-aluno")
    public String salvarAluno(@RequestParam("nome") String nome, @RequestParam("email") String email, @RequestParam("senha") String senha, Model model){
        if (!validarSenha(senha)) {
            model.addAttribute("erro", "A senha deve ter no mínimo 8 caracteres, incluindo pelo menos uma letra, um número e uma letra maiúscula.");
            return "registra-aluno"; // ou qualquer outra página onde você deseja exibir o erro
        }

        // Se a senha for válida, criar a instância de Matricula e salvar
        Matricula matricula = new Matricula(nome, email, senha, "pendente");
        matriculaRepository.save(matricula);

        return "dashboard";
    }

    private boolean validarSenha(String senha) {
        // Verificar se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        // Verificar se a senha contém pelo menos uma letra
        if (!senha.matches(".*[a-zA-Z].*")) {
            return false;
        }

        // Verificar se a senha contém pelo menos um número
        if (!senha.matches(".*\\d.*")) {
            return false;
        }

        // Verificar se a senha contém pelo menos uma letra maiúscula
        if (!senha.matches(".*[A-Z].*")) {
            return false;
        }

        // Se todas as verificações passarem, a senha é válida
        return true;
    }

}


