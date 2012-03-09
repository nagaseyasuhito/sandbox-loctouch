package com.github.nagaseyasuhito.sandbox.loctouch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.github.nagaseyasuhito.sandbox.loctouch.geo.AddressNormalize;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class AddressNormalizeTest {

	@Test
	public void addressNormalizeTest() {
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.loctouch.com/v1/geo/address_normalize");

		AddressNormalize result = webResource.queryParam("address", "東京都新宿区新宿5丁目17番17号 渡菱ビル3階").get(AddressNormalize.class);
		assertThat(result.getResult().getAddress(), is("東京都新宿区新宿5-17-17 渡菱ビル3階"));
	}
}
