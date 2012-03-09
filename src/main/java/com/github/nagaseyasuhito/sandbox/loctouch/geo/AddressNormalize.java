package com.github.nagaseyasuhito.sandbox.loctouch.geo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address_normalize")
public class AddressNormalize {

	public static class Result {

		public static class Normalize {

			@XmlElement
			private String region;

			@XmlElement
			private String number;

			@XmlElement
			private String build;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getBuild() {
				return this.build;
			}

			public void setBuild(String build) {
				this.build = build;
			}
		}

		@XmlElement
		private String zip;

		@XmlElement(name = "region_id")
		private String regionId;

		@XmlElement
		private String address;

		@XmlElement
		private Normalize normalize;

		public String getZip() {
			return this.zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Normalize getNormalize() {
			return this.normalize;
		}

		public void setNormalize(Normalize normalize) {
			this.normalize = normalize;
		}
	}

	@XmlElement
	private Integer code;

	@XmlElement(name = "is_error")
	private Boolean error;

	@XmlElement
	private String query;

	@XmlElement
	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getError() {
		return this.error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
