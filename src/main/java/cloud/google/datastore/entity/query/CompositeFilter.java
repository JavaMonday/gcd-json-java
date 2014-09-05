/**
 * Copyright (C) 2014 xuanhung2401.
 *
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

package cloud.google.datastore.entity.query;

/**
 * @author xuanhung2401
 * 
 */
public class CompositeFilter {

	/**
	 * Acceptable values are: "AND":
	 * */
	private String operator = "AND";
	private Filter[] filters;

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Filter[] getFilters() {
		return filters;
	}

	public void setFilters(Filter[] filters) {
		this.filters = filters;
	}

}
