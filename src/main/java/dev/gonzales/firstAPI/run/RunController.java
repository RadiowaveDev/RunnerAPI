package dev.gonzales.firstAPI.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value="/api/runs")
public class RunController {
    private final RunRepository runRepository;

    public RunController( RunRepository runRepository){
        this.runRepository = runRepository;
    }

    @GetMapping(value="")
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping(value="/1")
    Run findById(){
        return runRepository.findById(1);
    }
}
