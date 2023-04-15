package com.khoingyen.realworldapp.service.imlp;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.khoingyen.realworldapp.entity.Article;
import com.khoingyen.realworldapp.model.article.dto.ArticleDTOCreate;
import com.khoingyen.realworldapp.model.article.dto.ArticleDTOResponse;
import com.khoingyen.realworldapp.model.article.mapper.ArticleMapper;
import com.khoingyen.realworldapp.repository.ArticleRepository;
import com.khoingyen.realworldapp.service.ArticleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{
    private final ArticleRepository articleRepository;

    @Override
    public Map<String, ArticleDTOResponse> createArticle(Map<String, ArticleDTOCreate> articleDTOCreateMap) {
        ArticleDTOCreate articleDTOCreate = articleDTOCreateMap.get("article");
        Article article = ArticleMapper.toArticle(a)
        return null;
    }
    
}