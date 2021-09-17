/*******************************************************************************
 * Java Swing Library 'Leaf' and 'Tsukishiro Editor' since 2009 February 24th
 * License: GNU General Public License v3+ (see LICENSE)
 * Author: Journal of Hamradio Informatics (http://pafelog.net)
*******************************************************************************/
package leaf.edit.shell;

import leaf.edit.cmd.EditorCommand;
import leaf.edit.ui.BasicTextEditor;

/**
 * テキストエディタを水平方向に画面分割するコマンドです。
 *
 * @author 無線部開発班
 */
public final class SplitEditorHorizontal extends EditorCommand {
	@Override
	public void process(Object... args) {
		getEditor().split(BasicTextEditor.HORIZONTAL_SPLIT);
	}
}
