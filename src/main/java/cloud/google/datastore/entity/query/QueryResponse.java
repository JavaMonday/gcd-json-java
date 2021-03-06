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
public class QueryResponse {

	private QueryResponseBatch<?> batch;

	public QueryResponseBatch<?> getBatch() {
		return batch;
	}

	public void setBatch(QueryResponseBatch<?> batch) {
		this.batch = batch;
	}

}
