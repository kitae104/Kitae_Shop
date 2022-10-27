package kr.inhatc.spring.item.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import kr.inhatc.spring.item.constant.ItemSellStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long id;			// 상품 코드 
	
	@Column(nullable = false, length = 50)
	private String itemNm;		// 상품 이름
	
	@Column(nullable = false)
	private int price;			// 상품 가격
	
	@Column(nullable = false, name = "number")
	private int stockNumber;	// 재고 수량
	
	@Enumerated(EnumType.STRING)
	private ItemSellStatus itemSellStatus;
	
	
	@Lob
	@Column(nullable = false)
	private String itemDetail;	// 상품 상세 설명 
	
	private LocalDateTime regTime;		// 등록 시간	
	
	private LocalDateTime updateTime;	// 수정 시간
}




