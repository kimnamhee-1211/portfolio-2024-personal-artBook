package com.artBook.myArtBook.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.artBook.myArtBook.board.model.vo.Attm;
import com.artBook.myArtBook.board.model.vo.Board;

@Mapper
public interface BoardMapper {

	int insertBoard(Board b);

	int insertAttm(ArrayList<Attm> attmList);

	
	
}
