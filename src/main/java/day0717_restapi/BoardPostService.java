/*
package day0717_restapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class BoardPostService {
	List<BoardPost> boardPosts = new ArrayList<>();  // 여기서 boardPosts는 데이터베이스 역할을 하는 것
	private Long nextPostId= 1L;
	private Long nextCommentId= 1L;

	public BoardPostDto createBoardPost(BoardPostDto boardPostDto) {
		return convertToBoardPostDto(boardPostDto);
	}

	private static BoardPost convertToBoardPostDto(BoardPostDto boardPostDto) {
		BoardPost boardPost = new BoardPost();
		boardPost.setTitle(boardPostDto.getTitle());
		boardPost.setContent(boardPostDto.getContent());
		boardPost.setAuthor(boardPostDto.getAuthor());
		if(boardPostDto.getComments()!=null){
			boardPostDto.getComments().forEach(CommentDto -> {
				Comment comment = convertToCommentEntity(commentDto);
				comment.setBoardPost(boardPost);
				boardPost.addComment(comment);
			});
		}
		return boardPost;
	}
	private static BoardPostDto convertToBoardPostDto(BoardPost boardPost) {
		BoardPostDto boardPostDto = new BoardPostDto();
		boardPostDto.setId(boardPost.getId());
		boardPostDto.setTitle(boardPost.getTitle());
		boardPostDto.setContent(boardPost.getContent());
		boardPostDto.setAuthor(boardPost.getAuthor());
		boardPostDto.setCreatedAt(boardPost.getCreatedAt());
		boardPostDto.setUpdatedAt(boardPost.getUpdatedAt());

		if(boardPost.getComments()!=null){
			boardPostDto.setComments(
				boardPost.getComments().stream().map
						(this::convertToCommentDto)
					.collect(Collectors.toList())
			);
		}
		return boardPostDto;
	}
}

 */
