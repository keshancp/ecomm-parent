package com.ecomm.orderservice.model;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String itemCode;
	private BigDecimal price;
	private Integer quantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
            name = "order_id"
    )
	private Orders order;

	@Override
	public String toString() {
		return "Item{" +
				"itemCode='" + itemCode + '\'' +
				", price=" + price +
				", quantity=" + quantity +
				", order=" + order +
				'}';
	}
}
