--USE [db_Easeyyel]
GO
/****** Object:  Table [dbo].[tb_aagg]    Script Date: 12/15/2017 15:34:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_aagg](
	[id] [int] NOT NULL,
	[name] [nvarchar](30) NOT NULL,
	[age] [tinyint] NOT NULL,
	[xinshiu] [money] NOT NULL,
	[shijian] [date] NOT NULL,
	[zhu] [ntext] NOT NULL,
 CONSTRAINT [PK_tb_aagg] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
