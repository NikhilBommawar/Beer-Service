package com.springframework.beerservice.bootstrap;

import com.springframework.beerservice.domain.Beer;
import com.springframework.beerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(20)
                            .upc(337010000001L)
                            .price(new BigDecimal(150))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("Pale-Ale")
                    .quantityToBrew(200)
                    .minOnHand(20)
                    .upc(337010000002L)
                    .price(new BigDecimal(150))
                    .build());
        }
        System.out.println("Loaded Beers "+beerRepository.count());
    }
}
