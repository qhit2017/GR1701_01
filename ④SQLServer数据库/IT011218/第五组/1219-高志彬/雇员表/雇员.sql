USE [db_Employee]
GO
/****** Object:  Table [dbo].[tb_Employee]    Script Date: 12/19/2017 09:08:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_Employee](
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
/****** Object:  Check [CK__tb_Employee__age__0AD2A005]    Script Date: 12/19/2017 09:08:57 ******/
ALTER TABLE [dbo].[tb_Employee]  WITH CHECK ADD CHECK  (([age]>(18) AND [age]<(60)))
GO
