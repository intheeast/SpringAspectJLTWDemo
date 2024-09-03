package com.intheeast.aspectjw.service;

import org.springframework.stereotype.Service;

@Service
public class StubEntitlementCalculationService 
								implements EntitlementCalculationService{

	@Override
	public void calculateEntitlement() {
		System.out.println("+StubEntitlementCalculationService::calculateEntitlement");
		try {

			Thread.sleep(1000);
			System.out.println("Calculating entitlement");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("-StubEntitlementCalculationService::calculateEntitlement");

	}
}
