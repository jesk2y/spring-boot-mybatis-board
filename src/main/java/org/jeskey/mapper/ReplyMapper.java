package org.jeskey.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.jeskey.domain.Reply;
import org.jeskey.dto.PageDTO;

@Mapper
public interface ReplyMapper {

	List<Reply> getListReply(PageDTO page);

	Reply getOneReply(Long rno);

	int insertReply(Reply reply);

	int updateReply(Reply reply);

	int deleteReply(Long rno);

	int totalCount(Long bno);
}
