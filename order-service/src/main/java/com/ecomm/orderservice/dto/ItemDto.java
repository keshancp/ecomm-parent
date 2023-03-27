package com.ecomm.orderservice.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {

	private Long id;

	@NotBlank(message = "Item code cannot be empty")
	private String itemCode;
	private BigDecimal price;
	private Integer quantity;
	private OrderDto order;

	@Override
	public String toString() {
		return "ItemDto{" +
				"id=" + id +
				", itemCode='" + itemCode + '\'' +
				", price=" + price +
				", quantity=" + quantity +
				", order=" + order +
				'}';
	}
}
