package ai.chat2db.excel.write.handler;

import ai.chat2db.excel.write.handler.context.SheetWriteHandlerContext;
import ai.chat2db.excel.write.metadata.holder.WriteSheetHolder;
import ai.chat2db.excel.write.metadata.holder.WriteWorkbookHolder;

/**
 * intercepts handle sheet creation
 *
 * @author Jiaju Zhuang
 */
public interface SheetWriteHandler extends WriteHandler {

    /**
     * Called before create the sheet
     *
     * @param context
     */
    default void beforeSheetCreate(SheetWriteHandlerContext context) {
        beforeSheetCreate(context.getWriteWorkbookHolder(), context.getWriteSheetHolder());
    }

    /**
     * Called before create the sheet
     *
     * @param writeWorkbookHolder
     * @param writeSheetHolder
     */
    default void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {}

    /**
     * Called after the sheet is created
     *
     * @param context
     */
    default void afterSheetCreate(SheetWriteHandlerContext context) {
        afterSheetCreate(context.getWriteWorkbookHolder(), context.getWriteSheetHolder());
    }

    /**
     * Called after the sheet is created
     *
     * @param writeWorkbookHolder
     * @param writeSheetHolder
     */
    default void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {}
}