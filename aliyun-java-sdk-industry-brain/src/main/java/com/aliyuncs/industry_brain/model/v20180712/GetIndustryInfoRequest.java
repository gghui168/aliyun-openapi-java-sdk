/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetIndustryInfoRequest extends RpcAcsRequest<GetIndustryInfoResponse> {
	
	public GetIndustryInfoRequest() {
		super("industry-brain", "2018-07-12", "GetIndustryInfo");
		setProtocol(ProtocolType.HTTPS);
	}

	private String industryCode;

	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
		if(industryCode != null){
			putQueryParameter("IndustryCode", industryCode);
		}
	}

	@Override
	public Class<GetIndustryInfoResponse> getResponseClass() {
		return GetIndustryInfoResponse.class;
	}

}
