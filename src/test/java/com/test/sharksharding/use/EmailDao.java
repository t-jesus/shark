/*
 * Copyright 2015-2101 gaoxianglong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.sharksharding.use;

import java.util.List;
import java.util.Map;

/**
 * email反向索引表Dao接口
 * 
 * @author gaoxianglong
 */
public interface EmailDao {
	public void setEmail(EmailInfo email) throws Exception;

	/**
	 * 不需要进行数据路由
	 *
	 * @author gaoxianglong
	 */
	public void setEmail2(EmailInfo email) throws Exception;

	public void setEmail(Map<String, Object> params) throws Exception;

	public List<EmailInfo> getEmail(EmailInfo email) throws Exception;

	/**
	 * 不需要进行数据路由
	 *
	 * @author gaoxianglong
	 */
	public List<EmailInfo> getEmail2(EmailInfo email) throws Exception;

	public List<EmailInfo> getEmail(Map<String, Object> params) throws Exception;
}