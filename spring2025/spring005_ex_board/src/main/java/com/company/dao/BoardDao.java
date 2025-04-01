package com.company.dao;

import java.util.List;

import com.company.dto.BoardDto;

public interface BoardDao {
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int bno);
	public BoardDto selectOne(int bno);
	public List<BoardDto> selectAll();

}
