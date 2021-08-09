package br.com.dio.controledeponto.service;

import br.com.dio.controledeponto.model.JornadaDeTrabalho;
import br.com.dio.controledeponto.repository.JornadaDeTrabalhoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornadaDeTrabalhoService {
    @Autowired
    JornadaDeTrabalhoRepositoy jornadaDeTrabalhoRepositoy;

    public JornadaDeTrabalhoService (JornadaDeTrabalhoRepositoy jornadaDeTrabalhoRepositoy){
        this.jornadaDeTrabalhoRepositoy = jornadaDeTrabalhoRepositoy;
    }

    public JornadaDeTrabalho saveJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoRepositoy.save(jornadaDeTrabalho);
    }

    public List<JornadaDeTrabalho> getAllJornadaDeTrabalho(){
        return jornadaDeTrabalhoRepositoy.findAll();
    }

    public JornadaDeTrabalho updateJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaDeTrabalhoRepositoy.save(jornadaDeTrabalho);
    }

    public void deleteJornadaDeTrabalho(JornadaDeTrabalho jornadaDeTrabalho){
        jornadaDeTrabalhoRepositoy.delete(jornadaDeTrabalho);
    }
}
