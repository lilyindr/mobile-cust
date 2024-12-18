package com.mobile_cust.Models;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CORE_CUSTOMER_BANK")
public class CoreCustomerBank {
	
	@Id
	@Column(name="ccba_id", nullable = false)
	private BigDecimal ccbaId;
	
	@Id
	@Column(name="ccba_ccust_no", length=20, nullable = false)
	private String ccbaCustNo;
}
