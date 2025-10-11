package com.panhasak.bank.account.properties;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Properties {

	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetail;
	private List<String> activeBranches;
}
