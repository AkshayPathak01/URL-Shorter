package com.akshay.urlShorteningService.service;

import org.springframework.stereotype.Service;

import com.akshay.urlShorteningService.model.Url;
import com.akshay.urlShorteningService.model.UrlDto;

@Service
public interface UrlService {
	public Url generateShortLink(UrlDto urlDto);

	public Url persistShortLink(Url url);

	public Url getEncodedUrl(String url);

	public void deleteShortLink(Url url);
}