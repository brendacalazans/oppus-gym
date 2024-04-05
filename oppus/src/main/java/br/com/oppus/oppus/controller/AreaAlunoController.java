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
public class AreaAlunoController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @GetMapping("/area-aluno.html")
    public String areaAluno() {
        // Retorna o nome do arquivo HTML sem a extensão ".html"
        return "area-aluno";
    }


    @PostMapping("/logar-aluno")
    public String login(@RequestParam("email") String email, @RequestParam("senha") String senha, Model model) {
        // Buscar a matrícula pelo email
        Matricula matricula = matriculaRepository.findByEmail(email);

        System.out.println("\n\n###Funcionando!\n\n");

        // Verificar se a matrícula foi encontrada e se a senha está correta
        if (matricula != null && matricula.getSenha().equals(senha)) {
            // Se sim, redirecionar para a página de dashboard ou página inicial
            model.addAttribute("matricula", matricula);
            return "dashboard"; // Substitua "/dashboard" pela URL da página de dashboard em sua aplicação
        } else {
            // Se não, redirecionar para a página de login com uma mensagem de erro
            model.addAttribute("erro", "Email ou senha incorretos.");
            return "area-aluno"; // Substitua "login" pelo nome da página de login em sua aplicação
        }
    }
}

