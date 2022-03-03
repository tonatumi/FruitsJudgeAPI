package com.example.springboottutorial;

import dto.FoodDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FruitsJudgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitsJudgeApplication.class, args);
    }

    @RestController//①
    public class FruitsJudgeController {
        @RequestMapping(value = "/judge", method = {RequestMethod.POST})//②
        //③judgeFruitsメソッドについて
        public List<FoodDTO> judgeFruits(@RequestBody List<FoodDTO> food) {

            //判別結果を入れるリストを作成。
            List<FoodDTO> resultList = new ArrayList<FoodDTO>();

            //果物かどうかを判定するプログラムを記述
            for (int i = 0; i < food.size(); ++i) {
                if (food.get(i).getType().equals("fruit")) {
                    resultList.add(food.get(i));
                }
            }

            return resultList;
        }

    }
}