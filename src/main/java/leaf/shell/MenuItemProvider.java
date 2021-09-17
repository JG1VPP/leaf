/*******************************************************************************
 * Java Swing Library 'Leaf' and 'Tsukishiro Editor' since 2009 February 24th
 * License: GNU General Public License v3+ (see LICENSE)
 * Author: Journal of Hamradio Informatics (http://pafelog.net)
*******************************************************************************/
package leaf.shell;

import javax.swing.*;

/**
 * {@link Command}継承クラスが{@link JMenuItem}を提供する場合に実装されます。
 *
 * @author 無線部開発班
 * @since 2011年12月11日
 */
public interface MenuItemProvider {
	/**
	 * コマンドのメニューアイテムを構築します。
	 *
	 * @param item 構築するメニューアイテム
	 *
	 * @return メニューアイテム
	 */
	JMenuItem createMenuItem(JMenuItem item);
}
