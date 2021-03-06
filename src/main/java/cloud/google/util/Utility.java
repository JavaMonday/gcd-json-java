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

package cloud.google.util;

/**
 * @author xuanhung2401
 * 
 */

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Utility {

	public static boolean isIntegerField(String typeName) {
		if (typeName.equals("int")
				|| typeName.equals("class java.lang.Integer")) {
			return true;
		}
		return false;
	}

	public static boolean isStringField(String typeName) {
		if (typeName.equals("class java.lang.String")) {
			return true;
		}
		return false;
	}

	public static boolean isBooleanField(String typeName) {
		if (typeName.equals("class java.lang.Boolean")
				|| typeName.equals("boolean")) {
			return true;
		}
		return false;
	}

	public static boolean isDateTimeField(String typeName) {
		if (typeName.equals("class java.util.Date")) {
			return true;
		}
		return false;
	}

	public static boolean isDoubleField(String typeName) {
		if (typeName.equals("class java.lang.Double")
				|| typeName.equals("double")) {
			return true;
		}
		return false;
	}

	public static boolean isListField(String typeName) {
		if (typeName.contains("java.util.List")
				|| typeName.contains("java.util.ArrayList")) {
			return true;
		}
		return false;
	}

	public static String generateGoogleDataType(String originTypeName) {
		if (isListField(originTypeName)) {
			return "listValue";
		} else if (isIntegerField(originTypeName)) {
			return "integerValue";
		} else if (isDoubleField(originTypeName)) {
			return "doubleValue";
		} else if (isBooleanField(originTypeName)) {
			return "booleanValue";
		} else if (isDateTimeField(originTypeName)) {
			return "dateTimeValue";
		} else if (isStringField(originTypeName)) {
			return "stringValue";
		}
		return "stringValue";
	}

	public static <T> T fromJsonToObject(Class<T> clazz, String jsonStr) {
		try {
			return new Gson().fromJson(jsonStr, clazz);
		} catch (Exception e) {
			return null;
		}
	}

	public static <T> List<List<T>> splitList(List<T> parent, int subSize) {
		List<List<T>> result = new ArrayList<List<T>>();
		List<T> sub = new ArrayList<T>();
		for (int i = 0; i < parent.size(); i++) {
			sub.add(parent.get(i));
			if (sub.size() == subSize || (parent.size() - 1) == i) {
				result.add(sub);
				sub = new ArrayList<T>();
			}
		}
		return result;
	}
}
