package com.dodeca.coinwatcher.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @GetMapping("/market")
    @Operation(summary = "거래 가능한 마켓 리스트 조회",description = "거래 가능한 마켓 리스트 조회")
    String readMarketList()
    {
        return "TEST";
    }

    @GetMapping("/market/{market}/coin")
    @Operation(summary = "거래 가능한 코인 리스트 조회",description = "거래 가능한 코인 리스트 조회")
    String readCoinList(@PathVariable String market)
    {
        return market;
    }

    @GetMapping("/market/{market}/coin/{coin}")
    @Operation(summary = "코인 가격 조회",description = "코인 가격 조회")
    String readCoinPrice(@PathVariable String market, @PathVariable String coin,
                         @RequestParam(name = "len",defaultValue = "20" ) int length,
                         @RequestParam(name = "chanel",defaultValue = "15") int chanel,
                         @RequestParam(name = "tecnicalIndicatoer",required = false)String tecnicalIndicatoer)
    {
        System.out.println(tecnicalIndicatoer);
        return market;
    }




}
