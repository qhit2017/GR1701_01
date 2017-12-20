USE [db_zuoye]
GO
/****** Object:  Table [dbo].[Table_db_工作表]    Script Date: 12/17/2017 20:29:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_db_工作表](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[gender] [nchar](10) NOT NULL,
	[age] [tinyint] NOT NULL,
	[salary] [money] NULL,
	[profession] [ntext] NOT NULL,
	[resume] [text] NOT NULL,
	[ruzhishijian] [datetime] NOT NULL,
 CONSTRAINT [PK_Table_db_工作表] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF_Table_db_工作表_salary]    Script Date: 12/17/2017 20:29:46 ******/
ALTER TABLE [dbo].[Table_db_工作表] ADD  CONSTRAINT [DF_Table_db_工作表_salary]  DEFAULT ((2800)) FOR [salary]
GO
