package com.aclab.dne.controllers;

import com.aclab.dne.configuration.SwaggerConfig;
import com.aclab.dne.converter.PromotionConverter;
import com.aclab.dne.repositories.PromotionRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/promotions")
@Api(tags = { SwaggerConfig.PROMOTION })
public class PromotionController {

    private static final Logger LOG = LoggerFactory.getLogger(PromotionController.class);
    private final PromotionConverter promotionConverter;
    private final PromotionRepository promotionRepository;

    @Autowired
    public PromotionController(PromotionConverter promotionConverter, PromotionRepository promotionRepository) {
        this.promotionConverter = promotionConverter;
        this.promotionRepository = promotionRepository;
    }
}
