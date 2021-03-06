USE [db_employee1]
GO
/****** Object:  Table [dbo].[tb_employee111]    Script Date: 12/16/2017 15:29:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee111](
	[id] [int] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[department] [nvarchar](16) NULL,
	[dateline] [date] NULL,
	[recomment] [bit] NULL,
	[remarks] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__014935CB]    Script Date: 12/16/2017 15:29:26 ******/
ALTER TABLE [dbo].[tb_employee111] ADD  DEFAULT ((2000)) FOR [salary]
GO
