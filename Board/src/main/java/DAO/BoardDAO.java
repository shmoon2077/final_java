package DAO;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DBManager.DBManager;
import domain.BoardVO;

public class BoardDAO  {

	//글쓰기  
	public int insert(BoardVO vo) {
		String sql = "insert into board ( btitle , bcontent , bname, bip ) values ( ?, ? ,? ,?)";
		int result = -1;

		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		conn = db.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,vo.getBtitle());
			pstmt.setString(2,vo.getBcontent());
			pstmt.setString(3,vo.getBname());
			pstmt.setString(4,InetAddress.getLocalHost().getHostAddress());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return result;
	} // end insert

		// 최신글읽기
		public ArrayList<BoardVO> selectAll() {
			String sql = "select * from board order by bno desc";
			ArrayList<BoardVO> result = new ArrayList<>();

			DBManager db = new DBManager();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			conn = db.getConnection();

			try {
				pstmt = conn.prepareStatement(sql);
				rset = pstmt.executeQuery();
				while (rset.next()) {
					result.add(new BoardVO(
							rset.getInt("bno"),
							rset.getString("btitle"),
							rset.getString("bcontent"),
							rset.getString("bname"),
							rset.getInt("bhit"),
							rset.getString("bdate"),
							rset.getString("bip")						
							)
							);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						if (conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			return result;
		} // end new

		// 해당글읽기 ,해당글수정폼
		public BoardVO select(int bno) {
			String sql = "select * from board where bno = ?";
			BoardVO result = new BoardVO();

			DBManager db = new DBManager();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			conn = db.getConnection();

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bno);
				
				rset = pstmt.executeQuery(); // 표
				if (rset.next()) { result = new BoardVO(
						rset.getInt("bno"),
						rset.getString("btitle"),
						rset.getString("bcontent"),
						rset.getString("bname"),
						rset.getInt("bhit"),
						rset.getString("bdate"),
						rset.getString("bip")						
						); }
				
				
				//int bno, String btitle, String bcontent, String bname, int bhit, String bdate, String bip
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						if (conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			return result;
		} // end read

		// 조회수 올리기 -
		public int updateHit(int bno) {
			String sql = "update board set bhit=bhit+1 where bno=?";
			int result = -1;

			DBManager db = new DBManager();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			conn = db.getConnection();

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bno);
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						if (conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			return result;
		} // end hit

		// 해당글수정
		public int update(BoardVO vo) {
			String sql = "update board set btitle=?, bcontent =? where bno=?";
			int result = -1;

			DBManager db = new DBManager();
			Connection conn = null;
			PreparedStatement pstmt = null;

			ResultSet rset = null;
			conn = db.getConnection();

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getBtitle());
				pstmt.setString(2, vo.getBcontent());
				pstmt.setInt(3, vo.getBno());
				
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						if (conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			return result;
		} // end edit

		// 해당글삭제
		public int delete(int bno) {
			String sql = "delete from board where bno=?";
			int result = -1;

			DBManager db = new DBManager();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			conn = db.getConnection();

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,bno);
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						if (conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			return result;
		} // end delete

	
	


}
