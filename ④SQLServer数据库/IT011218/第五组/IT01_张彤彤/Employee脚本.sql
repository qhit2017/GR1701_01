USE [db_employee1]
GO
/****** Object:  Table [dbo].[tb_employeel]    Script Date: 12/19/2017 20:58:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employeel](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](16) NOT NULL,
	[age] [tinyint] NULL,
	[dateline] [date] NULL,
	[salary] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
