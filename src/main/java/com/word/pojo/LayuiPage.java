/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LayuiPage
 * Author:   Administrator
 * Date:     2019/4/20 0020 10:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.word.pojo;

import java.util.List;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2019/4/20 0020
 * @since 1.0.0
 */
public class LayuiPage<T> {

	private Long total;

	private List<T> data;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}