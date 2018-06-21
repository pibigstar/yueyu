package com.pibigstar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pibigstar.common.annotation.MyLogger;
import com.pibigstar.domain.Sentence;
import com.pibigstar.domain.enums.Type;
import com.pibigstar.domain.result.MyResponse;
import com.pibigstar.service.SentenceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/sentence")
@Api(value="悦语查询",tags="悦语Controller")
public class SentenceController extends BaseController{
	@Autowired
	private SentenceService sentenceService;
	
	@GetMapping("list")
	@ApiOperation("查询全部悦语")
	public MyResponse list() {
		List<Sentence> sentences = sentenceService.findAll();
		return success(sentences);
	}
	@GetMapping("/quotes")
	@ApiOperation("查询全部名言")
	public MyResponse listQuotes() {
		List<Sentence> sentences = sentenceService.findAllByType(Type.QUOTES.getType());
		return success(sentences);
	}
	
	@GetMapping("/jokes")
	@ApiOperation("查询全部段子")
	public MyResponse listJokes() {
		List<Sentence> sentences = sentenceService.findAllByType(Type.JOKES.getType());
		return success(sentences);
	}
	@GetMapping("/beautiful")
	@ApiOperation("查询全部段子")
	public MyResponse listBeautiful() {
		List<Sentence> sentences = sentenceService.findAllByType(Type.BEAUTIFUL.getType());
		return success(sentences);
	}
	
	@GetMapping("/search")
	@ApiOperation("模糊查询悦语")
	public MyResponse searchByStr(@ApiParam(name="str",value="标题或者内容",required=true)String str) {
		return success(sentenceService.findAllLike(str));
	}

}
