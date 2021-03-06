USE [db_guyuan]
GO
/****** Object:  Table [dbo].[tb_guyuan]    Script Date: 12/18/2017 21:26:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_guyuan](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](10) NULL,
	[nianling] [tinyint] NULL,
	[riqi] [datetime] NULL,
	[xingsui] [decimal](8, 3) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
