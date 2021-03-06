USE [db_Guoliuhang]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/18/2017 21:26:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](16) NULL,
	[nianling] [tinyint] NULL,
	[riqi] [datetime] NULL,
	[xingsui] [decimal](6, 4) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
